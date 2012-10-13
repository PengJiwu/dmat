package it.unipr.aotlab.dmat.scalabindings

import java.util.NoSuchElementException

import it.unipr.aotlab.dmat.scalabindings.matrices._
import it.unipr.aotlab.dmat.scalabindings.matrices.operations.MatrixOperationsContextHandler
import it.unipr.aotlab.dmat.scalabindings.typewire.MatrixElementTypes


class Program {
	
	val matrix: MatrixBuilder = new MatrixBuilder(this)
	
	val elements = MatrixElementTypes
	
	def define(what: MatrixBuilder): Matrix = what.build;
	def define_temp(what: MatrixBuilder): Matrix = ctxHandler.addTemporary(what.build)
	
	def get_matrix(name: String)(implicit auth: MatrixBuilder.AuthToken with NotNull): Matrix = {
	  if (is_matrix_temporary(name)) throw new NoSuchElementException("Cannot access matrix "+name+": it is a temporary")
	  try {
	    return mymatrices(name)
	  } catch {
	    case nse: NoSuchElementException => throw new NoSuchElementException("Cannot access matrix "+name+": never defined\n\tCaused by: "+nse.getMessage)
	  }
	}
	def is_matrix_temporary(name: String): Boolean = ctxHandler.getTemporary(name).isDefined
	
	implicit def integer_to_MatrixRows(r: Int): MatrixRows = new MatrixRows(r)
	implicit def integer_to_MatrixCols(c: Int): MatrixCols = new MatrixCols(c)
	
	implicit def netGroupToHostsSeq(ng: NetGroup): Seq[Host] = { return ng.nodes.toSeq }
	
	implicit def getOperationsContext = ctxHandler.getContext
	
	
	def B(name: String, size: MatrixDims): MatrixChunkStructure = { println("[SCALA] B("+name+")"); MatrixChunkStructure(size,name) }
	
	
	def register(name: String, matrix: Matrix)(implicit auth: Matrix.AuthToken with NotNull) {
		println("[SCALA] Registering matrix "+name+"...");
		mymatrices.put(name,matrix)
	}
	
	private val mymatrices = scala.collection.mutable.Map[String,Matrix]()
	private val ctxHandler: MatrixOperationsContextHandler = new MatrixOperationsContextHandler
}
