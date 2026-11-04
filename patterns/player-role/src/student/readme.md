In questo diagramma Student è il player e possiede due ruoli distinti:
- un AttendanceRole, che indica se studia a tempo pieno o parziale;
- un LevelRole, che indica il livello degli studi.
Le molteplicità 1 indicano che ogni studente deve avere esattamente un ruolo per ciascuna dimensione e che ogni ruolo è associato a un solo studente. Uno studente può quindi essere, per esempio, contemporaneamente FullTimeStudent e UndergraduateStudent.


Lo stesso oggetto Student mantiene la propria identità mentre i suoi ruoli cambiano. Inoltre, i due ruoli possono evolvere indipendentemente: cambiare la frequenza non modifica il livello di studi.

Nota sulla gestione dei ruoli: i costruttori dei ruoli hanno visibilità di package; per mantenere coerente l’associazione, il codice del package deve crearli attraverso Student. Un eventuale riferimento conservato a un vecchio ruolo rimane utilizzabile anche dopo la sua sostituzione, ma quel ruolo non è più quello corrente dello studente.