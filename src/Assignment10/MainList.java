package Assignment10;

import java.util.logging.Logger;

public class MainList {
    public static void main(String[] args) {
        Logger logger=Logger.getLogger(MainList.class.getName());
        SList<Integer> list=new SList<>();
        SListIterator<Integer> iterator=list.iterator();

        iterator.addNode(23);
        iterator.addNode(2);
        iterator.addNode(13);
        iterator.removeNode(1);
        iterator.addNode(29);
        iterator.removeNode(0);

        logger.info(list.toString());
    }
}
