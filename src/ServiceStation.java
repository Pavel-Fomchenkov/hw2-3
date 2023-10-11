public class ServiceStation {
    private final Servisable[] servisables = new Servisable[10];

    public void addToServise(Servisable servisable) {
        if (servisables[servisables.length - 1] != null) {
            System.out.println("Мест нет");
        } else {
            for (int i = 0; i < servisables.length; i++) {
                if (servisables[i] == null) {
                    servisables[i] = servisable;
                    break;
                }
            }
        }
    }

    public void service() {
        if (servisables[0] == null) {
            System.out.println("Очередь обслуживания пуста");
        } else {
            servisables[0].check();
            System.out.println();
            for (int i = 1; i < servisables.length; i++) {
                servisables[i - 1] = servisables[i];
            }
            servisables[servisables.length - 1] = null;
        }
    }
}
