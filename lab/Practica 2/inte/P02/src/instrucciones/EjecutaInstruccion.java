package instrucciones;

import machine.Wrapper;

public abstract class EjecutaInstruccion implements Instruccion {

    @Override
    public void operar(Wrapper wrap) {
        doOperation(wrap);
        wrap.aumentarIp(1);
    }

    protected abstract void doOperation(Wrapper wrap);
}
