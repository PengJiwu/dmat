package it.unipr.aotlab.dmat.scalabindings.matrices.operations

import it.unipr.aotlab.dmat.scalabindings.matrices.Matrix
import it.unipr.aotlab.dmat.scalabindings.matrices.MatrixDims

import MatrixOperations._
import MatrixComparisons._


trait MatrixExpression {
	import MatrixExpressionImplementationException._

  def resultSize: MatrixDims
    
  // if the MatrixExpression is a Matrix, return the Matrix itself
  // else get the result of the operation in the context and a new context
  protected[operations] def evaluateIn(ctx: MatrixOperationsContext): (Matrix, MatrixOperationsContext)
 
  
  // ----- OPERATORS DEFINITIONS -----
  // ASSIGNMENT OPERATORS
  def :=(rhs: MatrixExpression)(implicit ctx: MatrixOperationsContext): Matrix = {
    MatrixAssignment(this.asInstanceOf[Matrix],rhs).evaluateIn(ctx)
    return this.asInstanceOf[Matrix]
  }
  
  def :+=(rhs: MatrixExpression)(implicit ctx: MatrixOperationsContext): Matrix = {
    MatrixAdditionAssignment(this.asInstanceOf[Matrix],rhs).evaluateIn(ctx)
    return this.asInstanceOf[Matrix]
  }
	
	def :-=(rhs: MatrixExpression)(implicit ctx: MatrixOperationsContext): Matrix = {
		throw new MatrixExpressionNotImplementedOperatorException(":-= (MatrixSubtractionAssignment)")
	}

	def :*=(rhs: MatrixExpression)(implicit ctx: MatrixOperationsContext): Matrix = {
		// TODO When this will be fixed, uncomment optimizations in MatrixMultiplication
    throw new MatrixExpressionDMatWillFailException(":*=","MatrixMultiplicationAssignment","lhs := lhs * rhs")
		this := this * rhs
	}
  
  def :=*(rhs: MatrixExpression)(implicit ctx: MatrixOperationsContext): Matrix = {
		// TODO When this will be fixed, uncomment optimizations in MatrixMultiplication
    throw new MatrixExpressionDMatWillFailException(":=*","MatrixPreMultiplicationAssignment","lhs := rhs * lhs")
		this := rhs * this
	}
  
  // ARITHMETIC OPERATORS
	
	def unary_- : MatrixNonAssignmentOperation = {
		throw new MatrixExpressionNotImplementedOperatorException("unary_- (MatrixOpposite)")
	}
	
	def +(rhs: MatrixExpression): MatrixAddition = new MatrixAddition(this,rhs)
	
	def -(rhs: MatrixExpression): MatrixNonAssignmentOperation = throw new MatrixExpressionNotImplementedOperatorException("- (MatrixSubtraction)")
	
  def *(rhs: MatrixExpression): MatrixMultiplication = new MatrixMultiplication(this,rhs)
	
	// MATRIX OPERATORS
	def transposed: Matrix = throw new MatrixExpressionNotImplementedOperatorException("transposed (MatrixTransposition)")
	
	def T: Matrix = transposed

  // COMPARISON OPERATORS
  def =?=(rhs: MatrixExpression)(implicit ctx: MatrixOperationsContext): Boolean = MatrixEquality(this,rhs).evaluateIn(ctx)._1
  
	def =!?=(rhs: MatrixExpression)(implicit ctx: MatrixOperationsContext): Boolean = !(this =?= rhs)
   
}

