package fourierseries;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.lang.Math;

public class GraphingFunc extends JPanel {
    // Proportion of margin of panel
    final double MARGIN_OF_RIGHT = 0.05; // for right
    final double MARGIN_OF_LEFT = 0.05; // for left
    final double MARGIN_OF_ABOVE = 0.1; // for upper side
    final double MARGIN_OF_BELOW = 0.2; // for lower side
    // Width and height of panel
    int WIDTH_OF_PANEL;
    int HEIGHT_OF_PANEL;
    // Virtual maximum and minimum of coordinates
    final double VIRTUAL_X_MIN = -4.0;
    final double VIRTUAL_X_MAX = 4.0;
    final double VIRTUAL_Y_MIN = 0.0;
    final double VIRTUAL_Y_MAX = 2.0;

    /*
    * Following two functions are degined
    * to convert virtual coordinates
    * from (VIRTUAL_X_MIN,VIRTUAL_Y_MIN) to (VIRTUAL_X_MAX,VIRTUAL_Y_MAX)
    * into real coordinates.
    */
    private double virtualX(double x) { // get virtual x coordinate
        return (x-VIRTUAL_X_MIN)*WIDTH_OF_PANEL*(1.0-MARGIN_OF_RIGHT-MARGIN_OF_LEFT)/(VIRTUAL_X_MAX-VIRTUAL_X_MIN)+WIDTH_OF_PANEL*MARGIN_OF_LEFT;
    }
    private double virtualY(double y) { // get vritual y coordinate
        return (VIRTUAL_Y_MAX-y)*HEIGHT_OF_PANEL*(1.0-MARGIN_OF_ABOVE-MARGIN_OF_BELOW)/(VIRTUAL_Y_MAX-VIRTUAL_Y_MIN)+HEIGHT_OF_PANEL*MARGIN_OF_ABOVE;
    }
    // class for axis
    private class Axis extends Path2D.Double{
        public Axis(){
            this.moveTo(virtualX(VIRTUAL_X_MIN),virtualY(VIRTUAL_Y_MIN));
            this.lineTo(virtualX(VIRTUAL_X_MAX), virtualY(VIRTUAL_Y_MIN));
            this.moveTo(virtualX(0.0),virtualY(VIRTUAL_Y_MIN));
            this.lineTo(virtualX(0.0), virtualY(VIRTUAL_Y_MAX));
        }
    }
    // class for the trial function
    private class TrialFunction extends Path2D.Double{
        public TrialFunction(double width){ // get width of box
            this.moveTo(virtualX(-Math.PI),virtualY(0.0));
            this.lineTo(virtualX(-width), virtualY(0.0));
            this.lineTo(virtualX(-width), virtualY(1.0));
            this.lineTo(virtualX(width), virtualY(1.0));
            this.lineTo(virtualX(width), virtualY(0.0));
            this.lineTo(virtualX(Math.PI), virtualY(0.0));
        }
    }
    // class for the Fourier expansion upto n-th order
    private class FourierSum extends Path2D.Double{
        private double width; // width of the trial function
        private double n_max; // the largest order for partial sumation
        private double[] coeficientOfCos;  // coeficient of n-th cos fourier term a.k.a. a_n
        private double partialSumation(double x) // the value of partial sumation upto n_max at x
        {
            double result = 0.0;
            for(int n=0;n<=n_max;n++)
                result += coeficientOfCos[n]*Math.cos((double)n*x);
            return result;
        }
        public FourierSum(double width, int n_max){ // get width of the trial function and the largest order n_max
            this.width = width;
            this.n_max = n_max;
            this.coeficientOfCos = new double[n_max+1];
            
            coeficientOfCos[0] = width/Math.PI; // zeroth order coeficient
            for(int n=1; n<=n_max; n++)
                coeficientOfCos[n]=2.*Math.sin(width*n)/(double)n/Math.PI; // n-th order coeficient
            
            this.moveTo(virtualX(-Math.PI), virtualY(partialSumation(-Math.PI)));
            for(double x=-Math.PI+0.01;x<Math.PI+0.01;x+=0.01){
                this.lineTo(virtualX(x), virtualY(partialSumation(x)));
            }
        }
    }
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

        // Width and height of panel
        WIDTH_OF_PANEL = getWidth();
        HEIGHT_OF_PANEL = getHeight();
        
        // Drawing x-axis and y-axis
        g2.setPaint(Color.black);
        g2.draw(new Axis());
        
        // Drawing the box-shaped trial function
        g2.setPaint(Color.blue);
        g2.draw(new TrialFunction(1.0));

        // Drawing the partial sumation of Fourier series
        g2.setPaint(Color.red);
        g2.draw(new FourierSum(1.0,1000));
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        JButton okButton = new JButton("OK");
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(new GraphingFunc(), BorderLayout.CENTER);
        content.add(okButton, BorderLayout.EAST);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(content);
        f.setSize(1000,400);
        f.setLocation(0,0);
        f.setVisible(true);
    }
}
