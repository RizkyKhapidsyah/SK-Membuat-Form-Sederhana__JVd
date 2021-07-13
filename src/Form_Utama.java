import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Form_Utama extends JFrame {
    JLabel Label_Nama;
    JLabel Label_Umur;
    JLabel Label_Alamat;
    JLabel Label_TD1;
    JLabel Label_TD3;
    JLabel Label_TD2;
    JTextField Text_Nama;
    JTextField Text_Umur;
    JTextArea Text_Alamat;
    JScrollPane sp_Text_Alamat;
    Button Button_OK;
    JButton Button_Batal;

    public Form_Utama() {
        Form_UtamaLayout customLayout = new Form_UtamaLayout();

        getContentPane().setFont(new Font("Helvetica", Font.PLAIN, 12));
        getContentPane().setLayout(customLayout);

        Label_Nama = new JLabel("Nama");
        getContentPane().add(Label_Nama);

        Label_Umur = new JLabel("Umur");
        getContentPane().add(Label_Umur);

        Label_Alamat = new JLabel("Alamat");
        getContentPane().add(Label_Alamat);

        Label_TD1 = new JLabel(":");
        getContentPane().add(Label_TD1);

        Label_TD3 = new JLabel(":");
        getContentPane().add(Label_TD3);

        Label_TD2 = new JLabel(":");
        getContentPane().add(Label_TD2);

        Text_Nama = new JTextField("");
        getContentPane().add(Text_Nama);

        Text_Umur = new JTextField("");
        getContentPane().add(Text_Umur);

        Text_Alamat = new JTextArea("");
        sp_Text_Alamat = new JScrollPane(Text_Alamat);
        getContentPane().add(sp_Text_Alamat);

        Button_OK = new Button("OK");
        getContentPane().add(Button_OK);

        Button_Batal = new JButton("Batal");
        getContentPane().add(Button_Batal);

        setSize(getPreferredSize());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String args[]) {
        Form_Utama window = new Form_Utama();

        window.setTitle("Form_Utama");
        window.pack();
        window.show();
    }
}

class Form_UtamaLayout implements LayoutManager {

    public Form_UtamaLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 277 + insets.left + insets.right;
        dim.height = 197 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+8,72,24);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+32,72,24);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+8,insets.top+56,72,24);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+96,insets.top+8,16,24);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+96,insets.top+56,16,24);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+96,insets.top+32,16,24);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+104,insets.top+8,160,24);}
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+104,insets.top+32,160,24);}
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+104,insets.top+56,160,88);}
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+192,insets.top+152,72,24);}
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+112,insets.top+152,72,24);}
    }
}
