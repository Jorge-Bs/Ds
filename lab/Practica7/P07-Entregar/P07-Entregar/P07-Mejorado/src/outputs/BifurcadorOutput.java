package outputs;

import fileSystem.Output;

public class BifurcadorOutput implements Output {

        private Output[] listas;

        public BifurcadorOutput(Output ... lista) {
            this.listas = lista;
        }

        @Override
        public void send(char c) {
            try {
                for (Output lista : listas) {
                    lista.send(c);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void close() {
            try {
                for(Output out : listas){
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
