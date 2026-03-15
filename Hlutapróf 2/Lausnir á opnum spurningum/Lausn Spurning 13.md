# Lausn – Spurning 13

## Útskýrðu hvernig þú myndir hanna `VidburdurSpjald` sem custom component í JavaFX

Í svarinu skaltu:

- Lýsa hvaða viðmótshluti (t.d. `Label`, `VBox` ...) væru í component-inum og hvernig hann væri uppbyggður
- Útskýra hvernig `VidburdurSpjald` tengist `Vidburdur` módelinu
- Lýsa hvernig er tryggt að heiti og dagsetning uppfærist sjálfkrafa þegar nýr `Vidburdur` er settur í spjaldið

Þetta er **ekki kóðaspurning**, en svarið þarf að vera nægilega nákvæmt til að hægt sé að kóða út frá því.

---

## 1. Viðmótshlutar og uppbygging

`GridPane` með **2 línum og 2 dálkum**.

Í **fyrsta dálki** eru tvö `Label`:
- „Heiti“
- „Dagsetning“

Í **öðrum dálki** eru tvö `TextField` til að birta:
- heiti viðburðar
- dagsetningu

`VidburdurSpjald` erfir frá `GridPane` og hefur tvær tilviksbreytur af taginu `TextField`:
- fyrir **Heiti**
- fyrir **Dagsetningu**

Í `vidburdurSpjald-view.fxml` er rótin skilgreind svona:

```xml
<fx:root type="javafx.scene.layout.GridPane" ... />
```

---

## 2. Tengsl við módel (`Vidburdur`)

`VidburdurSpjald` tengist **völdum viðburði (`Vidburdur`) úr listanum**.

---

## 3. Sjálfvirk uppfærsla gagna

Þegar valið er nýtt stak (`v`) í listanum yfir viðburði er kallað á aðferðina:

```java
setVidburdur(v);
```

Sú aðferð:

- bindur `textProperty` í **Heiti** og **Dagsetningu** í `VidburdurSpjald`
við samsvarandi breytur í `Vidburdur`

Breytur í `Vidburdur` eru af taginu:

```java
SimpleStringProperty
```

Þannig uppfærist textinn **sjálfkrafa þegar nýr viðburður er settur í spjaldið**.
