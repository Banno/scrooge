//
// Automatically @generated by Scrooge
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
import Foundation
import TwitterApacheThrift
struct StructWithMap: Hashable {
    var data: [String:Int32]
    var emptylist: [Int32]
    enum CodingKeys: Int, CodingKey {
        case data = 1
        case emptylist = 2
    }
    init(data: [String:Int32], emptylist: [Int32]) {
        self.data = data
        self.emptylist = emptylist
    }
}
extension StructWithMap: ThriftCodable {}
