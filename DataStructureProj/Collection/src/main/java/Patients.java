/**
 * Created by L.z Double E on 3/30/2017.
 */
public class Patients {

         String name;
        String diagno;

        public Patients()
        {

        }

        public Patients(String nm, String diag)
        {
            name = nm;
            diagno = diag;
        }
        public void setName(String name)
        {
            this.name = name;
        }

        public void setDiagno(String course)
        {
            this.diagno = course;
        }

        public  String getName()
        {
            return name;
        }

        public String getDiagno()
        {
            return diagno;
        }

        @Override
        public String toString()
        {
            return "Patient Name: " + name +
                    "\n" + "Diagnosis: " + diagno;
        }
}
