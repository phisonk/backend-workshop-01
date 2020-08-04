import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {
    CircularBuffer cb = new CircularBuffer();

    @Test
    public void create_newbuffer(){
        CircularBuffer cb = new CircularBuffer(10);
    }

    @Test
    public void create_new_buffer_should_empty(){
        boolean result = cb.isEmpty();
        assertTrue("Buffer Not Available", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10(){
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++){
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is not full", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer(){
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A",cb.readData());
        assertEquals("B",cb.readData());
    }


    @Test
    public void write_H_to_full_buffer_should_replace_H_with_the_oldest_element(){
        CircularBuffer cb = new CircularBuffer();
        for(int i=0 ; i<10; i++){
            cb.writeData("A"+i);
            cb.readData();
        }
        cb.writeData("H");
        assertEquals("H",cb.readData());
    }

    @Test
    public void setSize_to_20_buffer_size_should_20(){
        CircularBuffer cb = new CircularBuffer();
        int bufferSize = 20;
        cb.setSize(bufferSize);
        for(int i=0; i<20; i++){
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer is not full", result);
    }

    @Test
    public void change_size_of_full_buffer_10_to_15_should_not_loss_any_element(){
        CircularBuffer cb = new CircularBuffer();
        for(int i=0; i<10; i++){
            cb.writeData("A" + i);
        }
        cb.setSize(15);
        for(int i=0; i<9; i++){
            assertEquals("A"+i, cb.readData());
        }
    }
}