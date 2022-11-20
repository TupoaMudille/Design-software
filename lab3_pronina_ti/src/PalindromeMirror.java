public class PalindromeMirror extends Decorator{
    public String getStringOfText(){
        return this.stringOfText.getStringOfText();
    }
    protected PalindromeMirror(StringOfText stringOfText){
        super(stringOfText);
    }
}
