//
// Automatically @generated by Scrooge
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
import Foundation
import TwitterApacheThrift
public class EnumStruct: ThriftCodable, Hashable {
    public var enumValue: SomeEnum
    enum CodingKeys: Int, CodingKey {
        case enumValue = 1
    }
    public init(enumValue: SomeEnum) {
        self.enumValue = enumValue
    }
    public func hash(into hasher: inout Hasher) {
        hasher.combine(self.enumValue)
    }
    public static func == (lhs: EnumStruct, rhs: EnumStruct) -> Bool {
        return lhs.enumValue == rhs.enumValue
    }
}
