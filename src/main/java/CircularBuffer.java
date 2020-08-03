import java.lang.reflect.Array;

public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this.buffer = new String[10];
    }

    public boolean isEmpty() {
        return bufferSize == 10;
    }

    public void writeData(String input) {
        bufferSize--;
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return bufferSize == 0;
    }

    public String readData() {
        return this.buffer[readPointer++];
    }

    public void setSize(int size) {
        String[] newBuffer = new String[size];
        if(this.buffer.length-bufferSize != 0){
            for(int i = 0; i<this.buffer.length-bufferSize-1; i++){
                newBuffer[i] = this.buffer[i];
            }
        }
        bufferSize = size-(this.buffer.length-bufferSize);
        this.buffer = newBuffer.clone();
    }
}
