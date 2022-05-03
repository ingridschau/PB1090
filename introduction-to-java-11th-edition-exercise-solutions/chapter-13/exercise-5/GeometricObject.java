import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    

    private String color = "white";
    private boolean filled;
    private Date dateCreated;


    public GeometricObject() {

        dateCreated = new Date();

    }

    public GeometricObject(String color, boolean filled) {

        dateCreated = new Date();
        this.color = color;
        this.filled = filled;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
    
   

    public static GeometricObject max(GeometricObject a, GeometricObject b) {
        
        if (a.compareTo(b) == -1) {
          return b;
        }
        return a;
      }

      @Override
      public int compareTo(GeometricObject o) {
          if (this.getArea() > o.getArea()) {
              return 1;
          } else if (this.getArea() < o.getArea()) {
              return -1;
  
          } else
              return 0;
  
      }


      @Override
    public String toString() {
        return "Created on " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
    }

  
}

