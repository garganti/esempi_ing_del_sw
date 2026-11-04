Usiamo Animal come player e gli oggetti HabitatRole come ruoli che un animale può assumere nel tempo. La classificazione alimentare resta invece rappresentata dalle sottoclassi di Animal, come nel diagramma.

L’associazione indica che:
- un animale può avere da zero a due ruoli;
- ogni ruolo appartiene a un solo animale.
Di seguito assumi che un animale possa avere al massimo un ruolo acquatico e uno terrestre. Il limite complessivo di due è nel diagramma; l’unicità per tipo è invece una scelta progettuale aggiuntiva.

Il vantaggio del pattern è che lo stesso animale può assumere più ruoli senza cambiare classe Java: l’orso rimane un Omnivore, mentre i suoi ruoli di habitat possono essere aggiunti o rimossi.

In questo esempio, un riferimento a un ruolo rimosso, come aquaticRole, rimane utilizzabile in Java: la rimozione lo toglie dalla collezione dell’animale, ma non distrugge l’oggetto. Se fosse necessario impedire anche l’uso successivo del ruolo, si potrebbe aggiungere uno stato che ne indichi l’attivazione.