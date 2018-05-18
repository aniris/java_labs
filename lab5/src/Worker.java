package lab5;

public class Worker{
    public int count = 0;
    public int current = 1;
    public int worker = 1;

    public Worker(int count) {
        this.count = count;
    }

    public String getWork(int count) {
        switch(count) {
            case 1:
                return("копает яму");
            case 2:
                return("сажает дерево");
            case 3:
                return("подвязывает саженец к кольям");
        }

        return "";
    }
}