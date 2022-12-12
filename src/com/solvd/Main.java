package com.solvd;

import com.solvd.customLinkedList.CustomLinkedList;
import com.solvd.exceptions.IncorrectFileNameException;
import org.apache.logging.log4j.*;
import java.io.IOException;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IncorrectFileNameException, IOException {

//        Logic logic = new Logic();
//        logic.run();

        /**
         * Custom LinkedList
         */
        CustomLinkedList<Integer> list = new CustomLinkedList<Integer>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insertAtStart(0);
        list.insertAt(3, 30);
        list.deleteAt(3);
        list.show();

    }
}
