public class CircularBuffer {
    private int bufferSize;
    private String[] buffer;
    private int readPointer;
    private int writePointer;

    public CircularBuffer() {
        this(10);
    }

    public CircularBuffer(int size) {
        this.bufferSize = size;
        this.buffer = new String[bufferSize];
    }

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void writeData(String input) {
        if(writePointer == bufferSize){
            writePointer = 0;
        }
        this.buffer[writePointer++] = input;
    }

    public boolean isFull() {
        return writePointer >= bufferSize;
    }

    public String readData() {
        if(readPointer == bufferSize){
            readPointer = 0;
        }
        return this.buffer[readPointer++];
    }

    public void setSize(int size) {
        String[] newBuffer = new String[size];
        System.arraycopy(this.buffer, 0, newBuffer, 0, bufferSize);
        bufferSize = size;
        this.buffer = newBuffer.clone();
    }
}
