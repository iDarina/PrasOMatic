public class PrasOMatic {
        public static void main(String[] args) {

            String[] wordListOne = {
                    "the cat", "the dog", "the bird", "the fish", "the rabbit",
                    "the lion", "the elephant", "the fox", "the panda", "the horse"
            };


            String[] wordListTwo = {
                    "jumps", "runs", "flies", "swims", "eats",
                    "sleeps", "plays", "hides", "climbs", "rests"
            };


            String[] wordListThree = {
                    "on the bed.", "in the garden.", "high in the sky.", "in the pond.", "a carrot.",
                    "under the tree.", "with a ball.", "in the den.", "up the tree.", "in the field."
            };

            int oneLength = wordListOne.length;
            int twoLength = wordListTwo.length;
            int threeLength = wordListThree.length;

            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

            System.out.println("I saw " + phrase);

        }
    }



