package software.ulpgc;

import software.ulpgc.Kata2.CSVFileRegisterLoader;
import software.ulpgc.Kata2.CoresRegisterProcesor;
import software.ulpgc.Kata2.Register;
import software.ulpgc.Kata2.RegisterLoader;
import software.ulpgc.Kata3.MainFrame;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RegisterLoader loader = new CSVFileRegisterLoader(new File("C:\\Users\\vr7vi\\IdeaProjectsq\\Kata3\\src\\main\\resources\\CPU_benchmark_v4.csv"));
        List<Register> registers = loader.load();
        Map<Integer, Integer> BarChartData = new CoresRegisterProcesor().process(registers);
        MainFrame frame = new MainFrame();
        frame.barChartDisplay().show(BarChartData);
        frame.setVisible(true);
    }
}
