package outputs;

import fileSystem.Output;

public class DuplicadosOutput implements Output {

        private Output output;

        private char last=' ';

        public DuplicadosOutput(Output output) {
            this.output = output;
        }

        @Override
        public void send(char c) {
            try {
                if(c==' '){
                    if(last==' '){
                        return;
                    }
                }
                last=c;
                output.send(c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void close() {
            try {
                output.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
