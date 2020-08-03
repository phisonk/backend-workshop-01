# Circular buffer

#### 1. Data structure ?

- Array of String

#### 2. Operation/Behavior/Methods ? user -> CB

- writeData(string):void
- readData(): string
- isFull(): boolean
- isEmpty(): boolean

- setSize(int): void

#### 3. Internal process ?

- buffer size = 10 (defualt)
- read pointer = 0
- write pointer = 0

#### Test Case

1. create_new_buffer_should_empty
2. create_new_buffer_with_default_size_should_10
3. write_A_B_to_buffer_should_read_A_B_from_buffer
4. write_A_B_C_D_to_buffer_and_remove_two_elements_should_remove_A_B_from_buffer
5. write_H_to_full_buffer_should_replace_H_with_the_oldest_element
6. setSize_to_20_buffer_size_should_20
7. when_buffer_is_full_read_pointer_should_next_to_write_pointer
