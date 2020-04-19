import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class myBinarySearchTreeTester {

    //tests if the general functionality of the insert method works
    //PASSED
    @Test
    public void bsTest() {
        int[] A = {2, 1, 4, 3, 6, 5};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.print();
        test.insert(3);
    }

    //tests if the general functionality of the height method works
    //PASSED
    @Test
    public void bsTest2() {
        int[] A = {1, 8, 0, 5};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.print();
        assertEquals(2, test.height());
    }

    //tests if the general functionality of the depth method works
    //PASSED
    @Test
    public void bsTest3() {
        int[] A = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.print();
        assertEquals(4, test.depth(4));
    }

    //test if the general functionality of the size method works
    //PASSED
    @Test
    public void bsTest4() {
        int[] A = {1, 2, 3};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.print();
        assertEquals(3, test.size());
    }

    //test if the insert method works for duplicates numbers
    //PASSED
    @Test
    public void bsTest5() {
        int[] A = {1, 2, 3, 4, 5, 6};
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
        test.print();
        test.insert(2);
    }
}