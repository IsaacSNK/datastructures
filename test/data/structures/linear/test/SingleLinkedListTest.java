package data.structures.linear.test;

import data.structures.linear.SingleLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class SingleLinkedListTest {
    @Test
    public void addElementToEmptyList() {
        var list = new SingleLinkedList();
        list.addLast(1);

        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals("1", list.toString());

        list = new SingleLinkedList();
        list.addFirst(0);

        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals("0", list.toString());
    }

    @Test
    public void addElementToNonEmptyList() {
        var list = new SingleLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);

        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals("1, 2, 3", list.toString());

        list = new SingleLinkedList();
        list.addFirst(0);
        list.addFirst(1);

        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals("1, 0", list.toString());
    }

    @Test
    public void addElementAt() {
        var list = new SingleLinkedList();
        list.addAt(1, 0);
        list.addAt(2, 1);
        list.addAt(0, 1);

        Assert.assertFalse(list.isEmpty());
        Assert.assertEquals("1, 0, 2", list.toString());


    }

    @Test(expected = IllegalArgumentException.class)
    public void addElementAtErrorWhenPosIsNegative()  {
        var list = new SingleLinkedList();
        list.addAt(1, -1);
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void addElementAtErrorWhenPosExceedsSize()  {
//        var list = new SingleLinkedList();
//        list.addAt(1, 10);
//    }
}
