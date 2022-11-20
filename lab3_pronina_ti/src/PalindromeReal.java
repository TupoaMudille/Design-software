public class PalindromeReal extends Decorator{

        public String getStringOfText(){
            return this.stringOfText.getStringOfText();
        }
        protected PalindromeReal(StringOfText product){
            super(product);
        }
    }

