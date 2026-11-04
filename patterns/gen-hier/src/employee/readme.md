Possiamo applicare il General Hierarchy Pattern rappresentando la supervisione come una gerarchia: ogni Employee mantiene il riferimento al proprio supervisore e ai dipendenti che supervisiona.

Poiché il diagramma stabilisce che solo un Manager può essere supervisore, aggiungiamo un controllo quando viene creato un collegamento. Le foglie della gerarchia saranno quindi Secretary, Technician e anche gli eventuali manager senza dipendenti.

====

In questa soluzione, supervisor rappresenta il padre e subordinates rappresenta i figli. Il metodo ricorsivo printHierarchy() sfrutta questa struttura per visitare la gerarchia.

Il controllo sui cicli è un vincolo aggiuntivo introdotto per ottenere una struttura gerarchica ad albero: il diagramma UML, da solo, non lo specifica. Allo stesso modo, Employee è stata dichiarata astratta come scelta progettuale; il diagramma non lo indica esplicitamente.