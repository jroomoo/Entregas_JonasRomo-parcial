    public class Dni {
        private int number;
        private char letter;
        private static final char[] letters = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};





        public Dni(int number) {
            if(number < 0) number = 0; // validación mínima
            this.number = number;
            this.letter = calculateLetter(number);
        }
        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public char getLetter() {
            return letter;
        }

        public void setLetter(char letter) {
            this.letter = letter;
        }



        private char calculateLetter (int number) {
            int index = (int)(number % 23);
            return letters[index];
        }
        
}
