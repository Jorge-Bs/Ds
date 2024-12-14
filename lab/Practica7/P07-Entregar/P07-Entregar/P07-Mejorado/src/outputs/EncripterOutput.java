package outputs;

import fileSystem.Output;

public class EncripterOutput implements Output {

    private Output output;
    public EncripterOutput(Output output) {
        this.output = output;
    }

    @Override
    public void send(char c) {
        try {
            if(Character.isDigit(c) || Character.isAlphabetic(c)){
                output.send((char) (c + 1));
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

