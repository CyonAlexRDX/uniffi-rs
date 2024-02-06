#[cfg(test)]
mod tests {

    uniffi::build_foreign_language_testcases!("tests/bindings/test_coverall.kts",);

    uniffi::build_foreign_language_testcases!(
        "tests/bindings/test_coverall.py",
        "tests/bindings/test_coverall.rb",
        "tests/bindings/test_coverall.swift",
        "tests/bindings/test_handlerace.kts",
    );
}
