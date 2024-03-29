package dz_2;

public class Lock {
    private LockKey key;
    public void setKey(LockKey key) {
        this.key = key;
    }
    @Override
    public String toString() {
        return "Lock{" +
                "key=" + key +
                '}';
    }
    public Lock(LockKey lockKey) {
        this.key = lockKey;
    }
    public int getKeyValueLock() {
        return key.getPINCODE();
    }

}