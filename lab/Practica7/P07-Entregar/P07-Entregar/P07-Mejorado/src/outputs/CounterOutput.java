package outputs;

import fileSystem.Output;

public class CounterOutput implements Output {

        private Output output;
        private int counter = 0;

        public CounterOutput(Output output) {
            this.output = output;
        }

        @Override
        public void send(char c) {
            try {
                output.send(c);
                counter++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void close() {
            try {
                output.send((char) counter);
                output.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public int getCounter() {
            return counter;
        }
}
