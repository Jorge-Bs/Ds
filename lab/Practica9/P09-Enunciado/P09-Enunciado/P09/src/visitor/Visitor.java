package visitor;

import nodos.*;
public interface Visitor{

    public Object visit(Programa p, Object param);
    public Object visit(Asignacion a, Object param);
    public Object visit(Read r, Object param);
    public Object visit(Print p, Object param);
    public Object visit(Variable v, Object param);
    public Object visit(ConstanteInt c, Object param);
    public Object visit(Suma s, Object param);
    public Object visit(Producto p, Object param);
    public Object visit(Division d, Object param);
}
