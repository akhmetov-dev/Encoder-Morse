public class MorseEncoder {
    MorseAlphabet morseAlphabet = new MorseAlphabet();

    public String encode(String inputString) {
        String[] words = inputString.toUpperCase().split(" ");

        StringBuilder morseCode = new StringBuilder("");

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                String morseCharacter = MorseAlphabet.alphabet.get(words[i].charAt(j));
                morseCode.append(morseCharacter);
                if (j < words[i].length() - 1) {
                    morseCode.append(" ");
                }
            }
            if (i < words.length - 1) {
                morseCode.append("   ");
            }
        }
        return morseCode.toString();
    }
}
