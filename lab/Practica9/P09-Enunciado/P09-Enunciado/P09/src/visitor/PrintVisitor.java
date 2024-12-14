package visitor;

import nodos.*;

public class PrintVisitor implements Visitor {
    @Override
    public Object visit(Programa prog, Object param) {
        for(Sentencia sent: prog.sentencias) {
            sent.accept(this, null);
        }
        return null;
    }

    @Override
    public Object visit(Asignacion a, Object param) {
        a.variable.accept(this, null);
        System.out.print(" = ");
        a.expr.accept(this, null);
        System.out.println(";");
        return null;
    }

    @Override
    public Object visit(Read read, Object param) {
        System.out.print("read ");
        read.var.accept(this, null);
        System.out.println(";");
        return null;
    }

    @Override
    public Object visit(Print print, Object param) {
        System.out.print("print ");
        print.expr.accept(this, null);
        System.out.println(";");
        return null;
    }

    @Override
    public Object visit(Variable var, Object param) {
        System.out.print(var.name);
        return null;
    }

    @Override
    public Object visit(ConstanteInt c, Object param) {
        System.out.print(c.valor);
        return null;
    }

    @Override
    public Object visit(Suma suma, Object param) {
        suma.left.accept(this, null);
        System.out.print(" + ");
        suma.right.accept(this, null);
        return null;
    }

    @Override
    public Object visit(Producto p, Object param) {
        p.left.accept(this, null);
        System.out.print(" * ");
        p.right.accept(this, null);
        return null;
    }

    @Override
    public Object visit(Division d, Object param) {
        d.left.accept(this, null);
        System.out.print(" / ");
        d.right.accept(this, null);
        return null;
    }

}
