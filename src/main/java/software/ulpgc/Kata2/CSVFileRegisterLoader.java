package software.ulpgc.Kata2;

import software.ulpgc.Register;
import software.ulpgc.RegisterLoader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVFileRegisterLoader implements RegisterLoader {
    private final File file;

    public CSVFileRegisterLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Register> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }

    private List<Register> load(FileReader reader) throws IOException {
        return load(new BufferedReader(reader));
    }
    private List<Register> load(BufferedReader reader) throws IOException {
        List<Register> result = new ArrayList<>();
        reader.readLine();
        while(true){
            String line = reader.readLine();
            if (line == null) break;
            result.add(toRegister(line));
        }
        return result;
    }

    private Register toRegister(String line) {
        return toRegister(line.split(","));
    }

    private Register toRegister(String[] fields) {
        return new Register(fields[0],
                (fields[1].isEmpty())?-1:Float.parseFloat(fields[1]),
                (fields[2].isEmpty())?-1:Integer.parseInt(fields[2]),
                fields[3]);
    }
}
