import java.util.Arrays;

public class PlaneService{

    public void planeInfo(Plane plane){
        System.out.println(plane.getModel());
        System.out.println(plane.getCountry());
        System.out.println(plane.getYear());
        System.out.println(plane.getHours());
        System.out.println(plane.isMilitary());
        System.out.println(plane.getWeigth());
        System.out.println(plane.getWingspan());
        System.out.println(plane.getTopSpeed());
        System.out.println(plane.getSeats());
        System.out.println(plane.getCost());
    }
    public void parameter(Plane plane){
        if (plane.isMilitary()){
            System.out.println(plane.getCost());
            System.out.println(plane.getTopSpeed());
        }
        else {
            System.out.println(plane.getModel());
            System.out.println(plane.getCost());
        }
    }
    public Plane parameter1(Plane p1,Plane p2){
        if (p1.getYear()>p2.getYear()){
            return p1;
        } else if (p1.getYear()<p2.getYear()) {
            return p2;
        }
        else return p1;
    }
    public Plane parameter2(Plane p1,Plane p2){
        if (p1.getWingspan()>p2.getWingspan()){
            return p1;
        } else if (p1.getWingspan()<p2.getWingspan()) {
            return p2;
        }
        else return p2;
    }
    public void parameter3(Plane p1,Plane p2,Plane p3){
        if (p1.getSeats()<p2.getSeats()&&p1.getSeats()<p3.getSeats()){
            System.out.println(p1.getCountry());
        } else if (p2.getSeats()<p1.getSeats()&&p2.getSeats()<p3.getSeats()) {
            System.out.println(p2.getCountry());
        } else if (p3.getSeats()<p1.getSeats()&&p3.getSeats()<p2.getSeats()) {
            System.out.println(p3.getCountry());
        } else if (p1.getSeats()==p2.getSeats()||p1.getSeats()==p3.getSeats()) {
            System.out.println(p1.getCountry());
        }else if (p2.getSeats()==p3.getSeats()){
            System.out.println(p2.getCountry());
        }else System.out.println(p1.getCountry());
    }
    PlaneService planeService=new PlaneService();
    public void parameter4(Plane[] planes){

        for (int i = 0; i < planes.length; i++) {
            if (!planes[i].isMilitary()) {
               planeService.planeInfo(planes[i]);
            }
        }
    }
    public void parameter5(Plane[]planes){
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()&&planes[i].getHours()>100){
                planeService.planeInfo(planes[i]);
            }
        }
    }
    public Plane parameter6(Plane[]planes){
        Plane plane=planes[planes.length-1];
        for (int i = planes.length-2; i >=0; i--) {
            if (plane.getWeigth()<planes[i].getWeigth()){
                plane=planes[i];
            }
        }return plane;
    }
    public Plane parameter7(Plane[] planes){
        Plane plane=planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (plane.isMilitary()&&plane.getCost()<planes[i].getCost()){
                return plane;
            }plane=planes[i];
        }
        return null;
    }
    public void parameter8(Plane[]planes){
        Plane plane ;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length; j++) {
                if (planes[j].getYear()<planes[i].getYear()){
                    plane=planes[i];
                    planes[i]=planes[j];
                    planes[j]=plane;
                }
            }
        }
        System.out.println(Arrays.toString(planes));
    }
}
