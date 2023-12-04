public class TestMain {
    public static void main(String[] args) {
        SimplePost simplePost = new SimplePost();
        MarkPost markPost = new MarkPost();
        Parcel parcel = new Parcel(markPost);
        parcel.post();
        Letter letter = new Letter(simplePost);
        letter.post();   
        EMSPost emsPost = new EMSPost();
        NewThing newThing = new NewThing(emsPost);
        newThing.post();
    }
}
