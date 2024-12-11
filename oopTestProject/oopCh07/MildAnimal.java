package oopCh07;

public abstract class MildAnimal implements MildMoveInterface {
    //채집
    public abstract void 채집();

    public void up() {
        System.out.println("위로이동");
    }

    @Override
    public void down() {
        System.out.println("아래로 이동");
    }

    @Override
    public void left() {
        System.out.println("좌로 이동");
    }

    @Override
    public void right() {
        System.out.println("우로 이동");
    }
}
