package BuilderDesignPattern;

/**
 * Created by udaka on 7/17/16.
 *
 */
class CDBuilder {

    CDType buildSonyCD() {
        CDType cds=new CDType();
        cds.addItem(new Sony());
        return cds;
    }

    CDType buildSamsungCD(){
        CDType cds=new CDType();
        cds.addItem(new Samsung());
        return cds;
    }
}
