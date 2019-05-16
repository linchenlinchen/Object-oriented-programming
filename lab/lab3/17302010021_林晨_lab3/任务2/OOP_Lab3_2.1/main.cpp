#include <iostream>
namespace area1{
    int a = 1;
}
namespace area2{
    int a = 2;
}
int main() {
    using namespace area1;
    std::cout<< "a: " << area1::a <<std::endl;
    using namespace area2;
    std::cout << "a: " << area2::a << std::endl;
    return 0;
}