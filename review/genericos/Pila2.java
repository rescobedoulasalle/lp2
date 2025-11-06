public class Pila2<T> {
    class Nodo {
        public T info;
        public Nodo sig;
    }

    private Nodo raiz;

    public void insertar(T x) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.info = x;
        if (raiz == null) {
            nuevo.sig = null;
            raiz = nuevo;
        } else {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }

    public T extraer() {
        if (raiz != null) {
            T informacion = raiz.info;
            raiz = raiz.sig;
            return informacion;
        } else {
            return null;
        }
    }

    public int cantidad() {
        int cant = 0;
        Nodo reco = raiz;
        while (reco != null) {
            reco = reco.sig;
            cant++;
        }
        return cant;
    }

}
