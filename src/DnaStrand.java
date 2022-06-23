public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder sb = new StringBuilder();
        for (String s : dna.split("")) {
            switch (s) {
                case "A":
                    s = "T";
                    break;
                case "T":
                    s = "A";
                    break;
                case "C":
                    s = "G";
                    break;
                case "G":
                    s = "C";
                    break;
            }
            sb.append(s);
        }
        return sb.toString();
    }
}