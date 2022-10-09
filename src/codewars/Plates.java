package codewars;

import java.util.Iterator;

public class Plates implements Iterable<String> {

    private final String initial_plate;

    public Plates(String first_plate) {
        initial_plate = first_plate;
    }

    @Override
    public Iterator<String> iterator() {
        return new PlateIterator(initial_plate);
    }

    private static class PlateIterator implements Iterator<String> {
        private final int plate_length;
        private final StringBuilder plate;
        private boolean has_next = true;
        private boolean need_next = false;

        PlateIterator(String first_plate) {
            plate_length = first_plate.length();
            plate = new StringBuilder(plate_length);
            plate.append(first_plate);
            has_next = true;
            need_next = false;
        }

        private void advance() {
            need_next = false;
            has_next = false;
            for (int i = plate_length - 1; i >= 0; i--) {
                char ch = plate.charAt(i);
                if (ch == '9')
                    plate.setCharAt(i, '0');
                else if (ch == 'Z')
                    plate.setCharAt(i,  'A');
                else {
                    plate.setCharAt(i, (char) (ch + 1));
                    has_next = true;
                    break;
                }
            }
            if (plate.substring(plate_length - 4).equals("0000"))
                plate.setCharAt(plate_length - 1, '1');
        }

        @Override
        public boolean hasNext() {
            if (has_next && need_next)
                advance();
            return has_next;
        }

        @Override
        public String next() {
            if (need_next)
                advance();
            need_next = true;
            return plate.toString();
        }
    }

    public static void main(String[] args) {
        Plates plates = new Plates("AAA0001");
        for(String plate : plates) {
            System.out.println(plate);
        }
    }
}
