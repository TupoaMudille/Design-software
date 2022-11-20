public abstract class Decorator implements StringOfText{
    final StringOfText stringOfText;

    protected Decorator(StringOfText stringOfText){
        this.stringOfText=stringOfText;
    }

}
