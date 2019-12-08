import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
public class TextAreaFrame extends JFrame
{
    private JTextArea textRead; // demo string
    private JTextArea textWrite; // stringa kopjohet ketu
    private JButton showList; // inicializon kopjimin e string
    private JButton addToList;

    public TextAreaFrame()
    {
        String filePath="PresidentUsa.txt";

        Box box = Box.createVerticalBox();

        File_IO IO = new File_IO();


        textRead = new JTextArea(30, 30 );
        textRead.setEditable( false );


        showList = new JButton( "Lexo Presidentet" );

        showList.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed( ActionEvent event )
                    {
                        textRead.setText( IO.ReadFromFile(filePath) );
                    }
                }
        );
        addToList = new JButton( "Shto President" );


        textWrite = new JTextArea( 2, 15 );


        addToList.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed( ActionEvent event )
                    {
                        String text = textWrite.getText();
                        IO.AppendToFile( text,filePath);
                    }
                }
        );
        box.add( showList );
        box.add( new JScrollPane( textRead ) );
        box.add( addToList );
        box.add( new JScrollPane( textWrite ) );
        add( box );
    }
}