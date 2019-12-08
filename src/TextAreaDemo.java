import javax.swing.JFrame;
public class TextAreaDemo
{
    public static void main( String[] args )
    {
        TextAreaFrame textAreaFrame = new TextAreaFrame();
        textAreaFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        textAreaFrame.setSize( 500, 500 );
        textAreaFrame.setVisible( true );
    }
}


// 1 make it in main so that the text get read and put into the cosntructor of jframe