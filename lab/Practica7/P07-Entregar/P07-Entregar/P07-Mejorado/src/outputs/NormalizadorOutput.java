package outputs;

import fileSystem.Output;

public class NormalizadorOutput implements Output {

        private Output output;
        public NormalizadorOutput(Output output) {
            this.output = output;
        }

        @Override
        public void send(char c) {
            try {
                if (c == '\r') {
                    c = '\n';
                }
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
