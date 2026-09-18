//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws IOException {
    ProcessBuilder pb = new ProcessBuilder("open", "-a", "Calculator");
    pb.start();

}
