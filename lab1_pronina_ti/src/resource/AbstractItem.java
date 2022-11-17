package resource;
public abstract class AbstractItem extends AbstractPlaceItem {
        protected String qType;
        public AbstractItem(String qType, float sizeX, float sizeY, float sizeZ, float weight){
        this.qType = qType;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        this.sizeZ = sizeZ;
        this.weight = weight;
    }
        public String GetItemType () {
        return "Unknown, wait human";
    }
        public String GetName () {
        return this.qType;
    }

    public String GetGabarite () {
        return "X:"+this.sizeX+", Y:"+this.sizeY+", Z:"+this.sizeZ+", weight:"+this.weight;
    }
    public String GetStoragePlace() {
        return "Unknown, wait human";
    }
}
