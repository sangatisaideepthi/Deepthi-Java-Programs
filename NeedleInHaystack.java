class NeedleInHaystack {
    public static void main(String[] args) {
        String haystack = "This is a simple haystack containing a needle.";
        String needle = "needle";
        int index = haystack.indexOf(needle);
        if (index != -1) {
            System.out.println("Needle found at index: " + index);
        } else {
            System.out.println("Needle not found in the haystack.");
        }
    }
}
