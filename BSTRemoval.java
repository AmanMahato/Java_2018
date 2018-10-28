public class BSTRemoval {

public boolean remove(int value, BSTNode parent) {

          if (value < this.value) {

                if (left != null)

                      return left.remove(value, this);

                else

                      return false;

          } else if (value > this.value) {

                if (right != null)

                      return right.remove(value, this);

                else

                      return false;

          } else {

                if (left != null && right != null) {

                      this.value = right.minValue();

                      right.remove(this.value, this);

                } else if (parent.left == this) {

                      parent.left = (left != null) ? left : right;

                } else if (parent.right == this) {

                      parent.right = (left != null) ? left : right;

                }

                return true;

          }

    }



    public int minValue() {

          if (left == null)

                return value;

          else

                return left.minValue();

    }

}
